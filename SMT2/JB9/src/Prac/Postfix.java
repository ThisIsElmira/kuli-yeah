package Prac;

public class Postfix
{
    int n, top;
    char[] stack;

    Postfix(int total)
    {
        n = total;
        top = -1;
        stack = new char[n];
        push('(');
    }

    void push(char c)
    {
        top++;
        stack[top] = c;
    }

    char pop()
    {
        char item = stack[top];
        top--;
        return item;
    }

    boolean isOperand (char c)
    {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || (c == ' ' || c == '.');
    }

    boolean isOperator (char c)
    {
        return (c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+');
    }

    int degree(char c)
    {
        switch (c)
        {
            case '^': return 3;
            case '%', '/', '*': return 2;
            case '-', '+': return 1;
            default: return 0;
        }
    }

    String convert(String Q)
    {
        String P = "";
        char c;
        for (int i = 0; i < n; i++)
        {
            c = Q.charAt(i);
            if (isOperand(c)) P += c;
            else if (c == '(') push(c);
            else if (c == ')')
            {
                while (stack[top] != '(') P += pop();
                pop();
            }
            else if (isOperator(c))
            {
                while (degree(stack[top]) > degree(c)) P += pop();
                push(c);
            }
        }
        return P;
    }
}
