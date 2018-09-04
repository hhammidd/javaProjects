We are going to create a Shape interface and concrete classes
implementing the Shape interface. A facade class ShapeMaker is defined as a next step.

ShapeMaker class uses the concrete classes to delegate user calls to these classes.
FacadePatternDemo, our demo class, will use ShapeMaker class to show the results.