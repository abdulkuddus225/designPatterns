# Design Patterns

#Here I will demonstrate the Design Patterns examples

1. Observer pattern
  The observer pattern define one-to-many dependency between objects so that when one object changes state, 
  all of the dependent are notified and updated automatically.
  
  Advantages of Observer Pattern:
    Provides a loosely coupled design between objects that interact. Loosely coupled objects are flexible with changing requirements.
    Here loose coupling means that the interacting objects should have less information about each other.

    Observer pattern provides this loose coupling as:

    Subject only knows that observer implement Observer interface.Nothing more.
    There is no need to modify Subject to add or remove observers.
    We can reuse subject and observer classes independently of each other.
