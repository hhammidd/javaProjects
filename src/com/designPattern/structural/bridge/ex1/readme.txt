We have a DrawAPI interface which is acting as a bridge implementer and
concrete classes RedCircle, GreenCircle implementing the DrawAPI interface.
Shape is an abstract class and will use object of DrawAPI. BridgePatternDemo,
our demo class will use Shape class to draw different colored circle.

