package day03;

public class StringerBuilder {

    public StringerBuilder() {

    }

    public String appender(String input){
        String result = "hello";
        result += input;
        return result;
    }
}
