package edu.cmu.cs.cs214.lab02.shapes;

/*
- First, consider what a better design of the shapes/ package would look like:
What would a common interface for a shape look like?
- Once you introduce the proper interface, you can make the changes to the
implementing classes to both (a) implement that interface precisely, and (b)
hide all information that is not part of the interface.
- Finally, find all uses of shapes and ensure that they depend only on the interface
and not on any internals. Also think about declaring types: if you’ve made all the
changes correctly, your main function no longer needs to provide Rectangle to
Renderer, so it should declare the shapes as Shapes, even if they are instantiated
as something more specific.
 */

public interface Shape {
    public double getArea();
}
