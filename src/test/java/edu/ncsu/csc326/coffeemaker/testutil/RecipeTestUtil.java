package edu.ncsu.csc326.coffeemaker.testutil;

/**
 * Contains utilities used in testing Recipes.
 */
public class RecipeTestUtil {

	// Valid typical recipe fields
    public static final String VALID_NAME_AMERICANO = "Americano";
    public static final String VALID_CHOCOLATE_AMERICANO = "0";
    public static final String VALID_COFFEE_AMERICANO = "5";
    public static final String VALID_MILK_AMERICANO = "0";
    public static final String VALID_SUGAR_AMERICANO = "0";
    public static final String VALID_PRICE_AMERICANO = "50";

	public static final String VALID_NAME_MOCHA = "Mocha";
	public static final String VALID_CHOCOLATE_MOCHA = "5";
	public static final String VALID_COFFEE_MOCHA = "5";
	public static final String VALID_MILK_MOCHA = "1";
	public static final String VALID_SUGAR_MOCHA = "1";
	public static final String VALID_PRICE_MOCHA = "60";

	public static final String VALID_NAME_LATTE = "Latte";
	public static final String VALID_CHOCOLATE_LATTE = "0";
	public static final String VALID_COFFEE_LATTE = "5";
	public static final String VALID_MILK_LATTE = "5";
	public static final String VALID_SUGAR_LATTE = "0";
	public static final String VALID_PRICE_LATTE = "70";

	public static final String VALID_NAME_HOTCHOCOLATE = "Hot Chocolate";
	public static final String VALID_CHOCOLATE_HOTCHOCOLATE = "10";
	public static final String VALID_COFFEE_HOTCHOCOLATE = "0";
	public static final String VALID_MILK_HOTCHOCOLATE = "1";
	public static final String VALID_SUGAR_HOTCHOCOLATE = "5";
	public static final String VALID_PRICE_HOTCHOCOLATE = "80";

	public static final String VALID_NAME_TAPWATER = "Tap Water";
	public static final String VALID_CHOCOLATE_TAPWATER = "0";
	public static final String VALID_COFFEE_TAPWATER = "0";
	public static final String VALID_MILK_TAPWATER = "0";
	public static final String VALID_SUGAR_TAPWATER = "0";
	public static final String VALID_PRICE_TAPWATER = "0";

	// Invalid fields
	public static final String INVALID_AMT_EMPTY = "";
	public static final String INVALID_AMT_NEGATIVE = "-888";
	public static final String INVALID_AMT_STRING = "notAnInteger";
	public static final String INVALID_AMT_FLOAT = "3.69";
	public static final String INVALID_AMT_SPECIALCHAR = "!#%^&";
}
