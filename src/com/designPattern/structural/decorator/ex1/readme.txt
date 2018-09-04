We're going to create a Shape interface and concrete classes implementing the
 Shape interface. We will then create an abstract decorator class ShapeDecorator implementing
  the Shape interface and having Shape object as its instance variable.

RedShapeDecorator is concrete class implementing ShapeDecorator.

DecoratorPatternDemo, our demo class will use RedShapeDecorator to decorate Shape objects.