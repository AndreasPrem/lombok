import java.util.List;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JacksonizedBuilderComplex.TestVoidName.class) class JacksonizedBuilderComplex {
  public static @java.lang.SuppressWarnings("all") @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "with",buildMethodName = "execute") class TestVoidName<T extends Number> {
    private @java.lang.SuppressWarnings("all") T number;
    private @java.lang.SuppressWarnings("all") int arg2;
    private @java.lang.SuppressWarnings("all") String arg3;
    private @java.lang.SuppressWarnings("all") JacksonizedBuilderComplex selfRef;
    @java.lang.SuppressWarnings("all") TestVoidName() {
      super();
    }
    public @java.lang.SuppressWarnings("all") JacksonizedBuilderComplex.TestVoidName<T> withNumber(final T number) {
      this.number = number;
      return this;
    }
    public @java.lang.SuppressWarnings("all") JacksonizedBuilderComplex.TestVoidName<T> withArg2(final int arg2) {
      this.arg2 = arg2;
      return this;
    }
    public @java.lang.SuppressWarnings("all") JacksonizedBuilderComplex.TestVoidName<T> withArg3(final String arg3) {
      this.arg3 = arg3;
      return this;
    }
    public @java.lang.SuppressWarnings("all") JacksonizedBuilderComplex.TestVoidName<T> withSelfRef(final JacksonizedBuilderComplex selfRef) {
      this.selfRef = selfRef;
      return this;
    }
    public @java.lang.SuppressWarnings("all") void execute() {
      JacksonizedBuilderComplex.<T>testVoidWithGenerics(this.number, this.arg2, this.arg3, this.selfRef);
    }
    public @java.lang.Override @java.lang.SuppressWarnings("all") java.lang.String toString() {
      return (((((((("JacksonizedBuilderComplex.TestVoidName(number=" + this.number) + ", arg2=") + this.arg2) + ", arg3=") + this.arg3) + ", selfRef=") + this.selfRef) + ")");
    }
  }
  JacksonizedBuilderComplex() {
    super();
  }
  private static @Jacksonized @Builder(buildMethodName = "execute",setterPrefix = "with") <T extends Number>void testVoidWithGenerics(T number, int arg2, String arg3, JacksonizedBuilderComplex selfRef) {
  }
  public static @java.lang.SuppressWarnings("all") <T extends Number>JacksonizedBuilderComplex.TestVoidName<T> builder() {
    return new JacksonizedBuilderComplex.TestVoidName<T>();
  }
}
