package pattpack.expr_intr;

import java.io.*;
 
/**
 *  This class represents an "greater then" conditional expression.
 */
public class Gt implements Expr {
    private Expr left, right;
    /**
     *  Construct an "greater then" conditional expression.
     *  @param left The left operand.
     *  @param right The right operand.
     */
    public Gt (Expr left, Expr right) { this.left = left; this.right = right; }
    /**
     *  Print this expression.
     *  @param out The stream where the expression is printed.
     */
    public void print (PrintStream out) {
	out.print (">(");
	left.print (out);
	out.print (",");
	right.print (out);
	out.print (")");
    }
    /**
     *  Evaluate the expression
     *  Needs value sharing in order to work
     */
    public int eval() {
        if (left.eval() > right.eval())
            return 1;
        return 0;
    }
}
