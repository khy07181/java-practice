package creational_patterns.prototype.docs;

import org.junit.jupiter.api.Test;

class DocumentTest {

    @Test
    void prototype() {
        DocumentTemplateManager.addTemplate(
                "welcome",
                new TextDocument("Welcome, {name}!")
        );
        DocumentTemplateManager.addTemplate(
                "meeting",
                new TextDocument("Meeting scheduled on {date} at {time}")
        );

        Document welcomeDocument = DocumentTemplateManager.createDocument("welcome");
        welcomeDocument.setContent(
                welcomeDocument.getContent().replace("{name}", "John Doe")
        );

        System.out.println("Welcome document: " + welcomeDocument.getContent());

        Document meetingDocument = DocumentTemplateManager.createDocument("meeting");
        welcomeDocument.setContent(
                welcomeDocument.getContent()
                        .replace("{date}", "2025-01-14")
                        .replace("{time}", "14:00")
        );

        System.out.println("Meeting document: " + meetingDocument.getContent());
    }

}
