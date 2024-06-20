class Calculate{
    private long output;
    private double remainder;
    private boolean end;



    public Calculate(){ //default constructor, unless specified this happens.
        remainder = 0.0; //the values are blank, therefore, we do not have anything.
        output = 0;
        end = false; //the user has not specified the end of the program, therefore it is not over yet.

    }

    public boolean finish(String input){//if the user inputs end, then the program ceases. 
        if(input.equalsIgnoreCase("end")) end = true;
        return end; //returns the previous case.
    }

    public boolean add(String command){
        return (command.equalsIgnoreCase("+")); //we check to see fi the user wants to add the numbers.
    }

    public boolean subtract(String command){
        return (command.equalsIgnoreCase("-")); //we check to see if the user wants to subtract the numbers.
    }

    public boolean remainder(String command){
        return (command.equalsIgnoreCase("%")); //we see if the user wants the remainder of the second number. 
    }

    public boolean divides(String command){
        return (command.equalsIgnoreCase("/")); //we see if the user wants to divide the first number by the second without the remainder
    }

    public boolean multiply(String command){
        return (command.equalsIgnoreCase("*")); //we see if the user wants to multiply the numbers
    }


}