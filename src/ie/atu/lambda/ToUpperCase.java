package ie.atu.lambda;

class ToUpperCase implements StringOperation {
    public String apply(String a) {
        return a.toUpperCase();
    }
}
