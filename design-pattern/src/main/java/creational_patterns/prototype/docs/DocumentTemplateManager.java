package creational_patterns.prototype.docs;

import java.util.HashMap;
import java.util.Map;

public class DocumentTemplateManager {

    private static final Map<String, Document> templates = new HashMap<>();

    public static void addTemplate(String name, Document document) {
        templates.put(name, document);
    }

    public static Document createDocument(String templateName) {
        Document template = templates.get(templateName);
        if (template == null) {
            throw new IllegalArgumentException("Template not found: " + templateName);
        }
        return (Document) template.clone();
    }
}
