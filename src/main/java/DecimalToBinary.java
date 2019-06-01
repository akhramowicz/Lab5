public class DecimalToBinary {

    public String convert(int number) throws Exception {
        if(number < 0){
            throw new Exception("Cant convert negative number to binary representation");
        }
        StringBuilder answer = new StringBuilder();
        return convert(number,answer).reverse().toString();
    }

    private StringBuilder convert(int number, StringBuilder answer) {
        return number == 0 ? answer : convert( number / 2, answer.append(number%2));
    }
}
