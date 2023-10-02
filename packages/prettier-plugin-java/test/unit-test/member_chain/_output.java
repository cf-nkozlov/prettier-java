public class BreakLongFunctionCall {

  public void notChainCall() {
    System.out.print("Not Chained");
  }

  public void doSomething() {
    return new Object()
      .something()
      .more();
  }

  public void doSomethingLongNew() {
    return something()
      .more()
      .and()
      .that()
      .as()
      .well()
      .but()
      .not()
      .something()
      .something();
  }

  public void doSomethingLongWithArgument() {
    return something()
      .more(firstArgument, secondArgument)
      .and(
        firstArgument,
        secondArgument,
        thirdArgument,
        fourthArgument,
        fifthArgument
      );
  }

  public void doSomethingLongNew2() {
    return new Object()
      .something()
      .more()
      .and()
      .that()
      .as()
      .well()
      .but()
      .not()
      .something();
  }

  public void doSomethingLongStatic() {
    return Object
      .something()
      .more()
      .and()
      .that()
      .as()
      .well()
      .but()
      .not()
      .something();
  }

  public void chainCall() {
    a.b.c.d.e.f;

    that.fine();

    that.is().fine();

    predictDropResponse.getSendResult().isFatalError;

    that
      .is()
      .not()
      .fine()
      .unchained();

    a()
      .b()
      .c()
      .d()
      .e();
  }
}
