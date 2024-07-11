package jpa.service;

import jpa.domain.Delivery;
import jpa.domain.Member;
import jpa.domain.Order;
import jpa.domain.OrderItem;
import jpa.domain.item.Item;
import jpa.repository.ItemRepository;
import jpa.repository.MemberRepository;
import jpa.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class OrderService {

    private OrderRepository orderRepository;
    private MemberRepository memberRepository;
    private ItemRepository itemRepository;

    @Transactional
    public Long order(Long memberId, Long itemId, int count) {
        Member member = memberRepository.findById(memberId).orElseThrow();
        Item item = itemRepository.findById(itemId).orElseThrow();

        Delivery delivery = Delivery.from(member.getAddress());

        OrderItem orderItem = OrderItem.of(item, item.getPrice(), count);

        Order order = Order.of(member, delivery, orderItem);

        orderRepository.save(order);

        return order.getId();
    }

    @Transactional
    public void cancelOrder(Long orderId) {
        Order order = orderRepository.findById(orderId).orElseThrow();
        order.cancel();
    }

}
