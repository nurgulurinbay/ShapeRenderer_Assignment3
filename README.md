# Bridge Design Pattern — Shape Renderer

## Description

This project demonstrates the **Bridge Structural Design Pattern** in Java using a Shape–Renderer example.

The abstraction and implementation are separated into two independent hierarchies:

* **Shapes:** `Circle`, `Square`
* **Renderers:** `VectorRenderer`, `RasterRenderer`

The `Shape` class contains a reference to the `Renderer` interface, allowing different renderers to be selected at runtime using composition.


## How It Works

The client creates shapes with different renderer implementations:

```java
Shape circle = new Circle(5, vectorRenderer);
Shape anotherCircle = new Circle(7, rasterRenderer);
```

The same `Circle` abstraction can therefore work with different renderers without changing the `Circle` class.

## Technologies

* Java
* IntelliJ IDEA
* Git / GitHub

## Design Pattern

**Bridge Pattern** — separates an abstraction from its implementation so that both can be changed independently.
