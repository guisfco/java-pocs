# Behavioral Patterns

Behavioral patterns are about how objects communicate and delegate work to each other.

## When should I use Strategy?

Use Strategy when you have multiple ways to do the same kind of operation, and you want to choose which one to use without filling your main class with `if/else` or `switch`.

A good smell for Strategy is this:

```java
if (type.equals("STANDARD")) {
    // standard shipping
} else if (type.equals("EXPRESS")) {
    // express shipping
} else if (type.equals("SAME_DAY")) {
    // same day shipping
}
```

That usually wants to become:

```java
ShippingStrategy strategy = new ExpressShipping();
var order = new Order(price, strategy);
```

Use Strategy when:

- The behavior changes depending on user choice, config, plan, region, payment method, shipping method, discount rule, sorting rule, or similar options.
- You want to add new behaviors without changing the class that uses them.
- You want each algorithm isolated in its own class and easier to test.
- You want to switch behavior at runtime.

In this project, `Order` should not need to know every shipping calculation. It only asks a `ShippingStrategy` to calculate the total. `StandardShipping` and `ExpressShipping` are interchangeable strategies.

Simple rule: use Strategy when the question is, "Which algorithm should I plug in?"

## When should I use Template Method?

Use Template Method when you have an algorithm with a fixed sequence of steps, but some of those steps vary depending on the specific case.

A good smell for Template Method is duplicated workflows like this:

```java
// create event
validate();
saveCreateEvent();
publish();
log();

// update event
validate();
saveUpdateEvent();
publish();
log();
```

The overall flow is the same, but one or two steps differ. That can become:

```java
public final void process(String event) {
    validate(event);
    save(event);
    publish(event);
    log(event);
}
```

Use Template Method when:

- The order of operations must stay the same.
- Several classes share the same workflow.
- You want the base class to control the algorithm.
- Subclasses should customize specific steps, not the whole process.
- You want to avoid copy-pasting the same workflow across multiple classes.

In this project, `EventHandler` controls the flow: run something before processing, process the event, then run something after processing. `CreateEventHandler` and `UpdateEventHandler` only decide what happens before and after.

The template method itself is `public final` because outside code should be able to run the full algorithm, but subclasses should not change its order:

```java
public final void process(String event) {
    beforeProcessing();
    IO.println("Processing event: " + event);
    afterProcessing();
}
```

The customizable steps are `protected` because they are extension points for subclasses, not methods that outside code should call directly:

```java
protected abstract void beforeProcessing();

protected abstract void afterProcessing();
```

They cannot be `private` because private methods cannot be overridden by subclasses. They usually should not be `public` because that would expose partial steps of the algorithm and allow clients to call them out of order.

Simple rule: use Template Method when the question is, "What parts of this fixed workflow should subclasses fill in?"

## Strategy vs Template Method

Both patterns help you reuse behavior while allowing variation, but they solve different kinds of variation.

Strategy is about choosing between complete interchangeable algorithms. The object using the strategy delegates the work to another object.

Template Method is about keeping one algorithm flow fixed while allowing subclasses to customize some steps.

| Question | Strategy | Template Method |
| --- | --- | --- |
| Main idea | Plug in an algorithm object | Inherit a fixed algorithm skeleton |
| Main mechanism | Composition | Inheritance |
| Who controls the flow? | The strategy object controls its own algorithm | The base class controls the algorithm order |
| What varies? | The whole algorithm | Specific steps inside a fixed algorithm |
| Can behavior change at runtime? | Yes, swap the strategy object | Usually no, because behavior comes from the subclass |
| Project example | `Order` uses `ShippingStrategy` | `EventHandler` defines `process(...)` |

Use Strategy when the behavior is a choice:

```java
order.setShippingStrategy(new ExpressShipping());
```

Use Template Method when the flow is a rule:

```java
public final void process(String event) {
    beforeProcessing();
    IO.println("Processing event: " + event);
    afterProcessing();
}
```

Simple difference: Strategy asks, "Which algorithm should I use?" Template Method asks, "Which steps should subclasses fill in this fixed algorithm?"
