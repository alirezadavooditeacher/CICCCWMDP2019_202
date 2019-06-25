import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StatementSymbol {
    public enum TYPE {
        VARIABLE          ,
        OPERATOR          ,
        OPEN_PARENTHESIS  ,
        CLOSE_PARENTHESIS
    }

    public char symbol;
    public TYPE type;

    /**
     * Check if the symbol is variable
     */
    private static boolean isVariable(char symbol) {
        Pattern p = Pattern.compile("[a-z]");
        Matcher m = p.matcher(String.valueOf(symbol));
        return m.matches();
    }

    /**
     * Check if the symbol is operator
     */
    private static boolean isOperator(char symbol) {
        Pattern p = Pattern.compile("[-+/%*]");
        Matcher m = p.matcher(String.valueOf(symbol));
        return m.matches();
    }

    public StatementSymbol(char symbol) throws Exception {
        this.symbol = symbol;

        if (symbol == '(') {
            type = TYPE.OPEN_PARENTHESIS;
        } else if (symbol == ')') {
            type = TYPE.CLOSE_PARENTHESIS;
        } else if (isVariable(symbol)) {
            type = TYPE.VARIABLE;
        } else if (isOperator(symbol)) {
            type = TYPE.OPERATOR;
        } else {
            throw new Exception("Unknown symbol");
        }
    }

    /**
     * Check if the symbol can be next
     */
    public boolean canBeNext(StatementSymbol next) {
        if (next.symbol == '-' && symbol != '-') {
            return true;
        }

        if (type != TYPE.VARIABLE && type != TYPE.OPERATOR) {
            return true;
        }

        return next.type != type;
    }

    /**
     * Check if the symbol can be the first symbol
     */
    public boolean canBeFirst() {
        if (type == TYPE.OPERATOR && symbol != '+' && symbol != '-') {
            return  false;
        }
        return type != TYPE.CLOSE_PARENTHESIS;
    }

    /**
     * Check if the symbol can be the last symbol
     */
    public boolean canBeLast() {
        return type == TYPE.VARIABLE || type == TYPE.CLOSE_PARENTHESIS;
    }
}
