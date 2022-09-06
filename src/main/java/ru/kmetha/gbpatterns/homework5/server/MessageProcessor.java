package ru.kmetha.gbpatterns.homework5.server;

import lombok.Getter;
import ru.kmetha.gbpatterns.lesson5.chain.Filter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class MessageProcessor {

    private final List<Filter> filterChain;

    private String message;

    public MessageProcessor() {
        this.filterChain = new ArrayList<>();
    }

    public MessageProcessor addFilter(Filter filter) {
        filterChain.add(filter);
        return this;
    }

    public MessageProcessor process(String message) {
        this.message = message;
        for (Filter filter : filterChain) {
            this.message = filter.filter(this.message);
        }
        return this;
    }
}
