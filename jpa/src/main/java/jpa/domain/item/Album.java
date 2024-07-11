package jpa.domain.item;

import static lombok.AccessLevel.PROTECTED;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@DiscriminatorValue("A")
@NoArgsConstructor(access = PROTECTED)
public class Album extends Item {

    private String artist;

    private String etc;

}
