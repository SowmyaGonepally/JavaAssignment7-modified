public class Type2 {
    static class Subtype2 extends Type1.Subtype1
    {
        //It says no default constructor available in subtype1
        Subtype2( ) {
          super("subtype2");
        }
    }
}
