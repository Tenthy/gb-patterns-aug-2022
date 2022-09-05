package ru.kmetha.gbpatterns.homework5.server;

public class CensorshipProcessor {

    private String censoredMessage;

    public String filter(String message) {
        MessageProcessor processor = new MessageProcessor();
        MessageProcessor censoredProcessor = processor.addFilter(f -> f.replaceAll("fuck", "****"))
                .addFilter(f -> f.replaceAll("idiot", "*****"))
                .addFilter(f -> f.replaceAll("cunt", "****"))
                .process(message);
        return censoredProcessor.getMessage();
    }
}
