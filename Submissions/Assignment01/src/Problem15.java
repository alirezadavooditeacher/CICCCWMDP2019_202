/**
 * Problem 15
 * Write A function which receives a string statement as input parameter which contains only
 * alphabet variables and binary operations including +, -, *, / and % and check whether the
 * statement is a valid arithmetic statement or not.
 */
public class Problem15 {
    /**
     * Check if the statement is a valid arithmetic statement
     */
    public static boolean isValidStatement(String statement) {
        int parentheses = 0;
        StatementSymbol last = null;

        for (int i = 0; i < statement.length(); i++) {
            char s = statement.charAt(i);
            if (s == ' ') {
                continue;
            }

            StatementSymbol symbol;
            try {
                symbol = new StatementSymbol(s);
            } catch (Exception e) {
                return false;
            }

            if (symbol.type == StatementSymbol.TYPE.OPEN_PARENTHESIS) {
                parentheses++;
            } else if (symbol.type == StatementSymbol.TYPE.CLOSE_PARENTHESIS) {
                parentheses--;
            }

            if (last != null && !last.canBeNext(symbol)) {
                return false;
            }

            if (last == null && !symbol.canBeFirst()) {
                return false;
            }

            last = symbol;
        }

        return parentheses == 0 && last.canBeLast();
    }
}
