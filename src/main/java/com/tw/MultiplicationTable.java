package com.tw;

public class MultiplicationTable {
    public String create(int startNumber, int endNumber) {
        return null;
    }



    public void main(String[] args) {
        validation obj1 = new validation();
        obj1.isNumberinRange(2,4);
        obj1.isNumberinRange(2,4);
        generateMultiplicationTable obj2 = new generateMultiplicationTable();
        String Line = obj2.generateMultiplicationExpression(2,4);
        obj2.generatemultiplicationLine(Line);

    }
class validation
{
    boolean isNumberinRange(int startNumber, int endNumber)
    {
        boolean inRange=false;
        if((startNumber>0 && endNumber>0) && (startNumber<1001 && endNumber <1001))
        {
                inRange=true;
        }
        return inRange;
    }
    boolean isEndBiggerThanStart(int startNumber, int endNumber)
    {
        boolean isEndBiggerThanStart=false;
        if(startNumber<endNumber)
        {
            isEndBiggerThanStart=true;
        }
        return isEndBiggerThanStart;
    }

}
class generateMultiplicationTable
{
    String generateMultiplicationExpression(int startNumber, int endNumber)
    {
        String multiplicationExpression="";
        for (int i = startNumber; i <= endNumber; i++) {
            for (int j = startNumber; j <= i; j++) {
                System.out.print(j + "*" + i + " = " + j * i );
                multiplicationExpression+=j + "*" + i + " = " + j * i;
            }
            multiplicationExpression+=".";
        }
        return multiplicationExpression;
    }
    void generatemultiplicationLine(String multiplicationExpression)
    {
        multiplicationExpression = multiplicationExpression.replace(".","\n");
    }

}

}
