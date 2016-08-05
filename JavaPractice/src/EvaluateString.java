import java.util.Stack;
 
public class EvaluateString
{
    public static String evaluate(String expression)
    {
        char[] tokens = expression.toCharArray();
        boolean isPrevOp = false;
        char prevOp=' ';
 
         // Stack for numbers: 'values'
        Stack<Float> values = new Stack<Float>();
 
        Stack<Character> ops = new Stack<Character>();
 
        for (int i = 0; i < tokens.length; i++)
        {
             // Current token is a whitespace, skip it
            if (tokens[i] == ' '){
            	//isPrevOp = false;
            	continue;
                
            } else if (tokens[i] >= '0' && tokens[i] <= '9')  						// Current token is a number, push it to stack for numbers
            {
            	isPrevOp = false;
                StringBuffer sbuf = new StringBuffer();
                // There may be more than one digits in number
                while (i < tokens.length && ((tokens[i] >= '0' && tokens[i] <= '9') || (tokens[i] == '.')))
                    sbuf.append(tokens[i++]);
                values.push(Float.parseFloat(sbuf.toString()));
                i--;
            } else if (tokens[i] == '('){			            					// Current token is an opening brace, push it to 'ops'
                ops.push(tokens[i]);
                //isPrevOp = false;
            }
            else if (tokens[i] == ')')												// Closing brace encountered, solve entire brace
            {
            	//isPrevOp = false;
                while (ops.peek() != '(')
                  values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                ops.pop();
            } else if (tokens[i] == '+' || tokens[i] == '-' ||  					// Current token is an operator.
                     tokens[i] == '*' || tokens[i] == '/')
            {
            	if (isPrevOp){
            		//return Float.toString(0.0f);
            		return "Unsupported operator : " +  Character.toString(prevOp) + tokens[i];
            	}
            	isPrevOp = true;
            	prevOp = tokens[i];
            	
                // While top of 'ops' has same or greater precedence to current
                // token, which is an operator. Apply operator on top of 'ops'
                // to top two elements in values stack
                while (!ops.empty() && hasPrecedence(tokens[i], ops.peek()))
                  values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                	
                // Push current token to 'ops'.
                ops.push(tokens[i]);
            }else {
            	//return Float.toString("invalid operand : ");
            	return "Unsupported operand : " + tokens[i];
        } 
        }
 
        // Entire expression has been parsed at this point, apply remaining
        // ops to remaining values
        while (!ops.empty()){
        	try{
        		values.push(applyOp(ops.pop(), values.pop(), values.pop()));
        	}catch(UnsupportedOperationException e){
        		return "Cannot divide by zero";
        	}
        	
        }
            
 
        // Top of 'values' contains result, return it
        return Float.toString(values.pop());
    }
 
    // Returns true if 'op2' has higher or same precedence as 'op1',
    // otherwise returns false.
    public static boolean hasPrecedence(char op1, char op2)
    {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }
 
    // A utility method to apply an operator 'op' on operands 'a' 
    // and 'b'. Return the result.
    public static float applyOp(char op, float b, float a)
    {
        switch (op)
        {
        case '+':
            return a + b;
        case '-':
            return a - b;
        case '*':
            return a * b;
        case '/':
            if (b == 0)
                throw new
                UnsupportedOperationException("Cannot divide by zero");
            return a / b;
        }
        return 0;
    }
    
    
 	
}