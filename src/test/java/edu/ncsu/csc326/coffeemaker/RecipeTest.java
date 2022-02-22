package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.InventoryException;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;
import edu.ncsu.csc326.coffeemaker.testutil.RecipeTestUtil;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

public class RecipeTest {

    private Recipe r;

    @Before
    public void initializeRecipe() {
        r = new Recipe();
    }

    @Test
    public void defaultConstructor_success() {
        assertEquals("", r.getName());
        assertEquals(0, r.getPrice());
        assertEquals(0, r.getAmtCoffee());
        assertEquals(0, r.getAmtMilk());
        assertEquals(0, r.getAmtSugar());
        assertEquals(0, r.getAmtChocolate());
    }

    @Test
    public void setName_success() {
        r.setName(RecipeTestUtil.VALID_NAME_AMERICANO);
        assertEquals("Americano", r.getName());
        r.setName(RecipeTestUtil.VALID_NAME_LATTE);
        assertEquals("Latte", r.getName());
        r.setName(RecipeTestUtil.VALID_NAME_HOTCHOCOLATE);
        assertEquals("Hot Chocolate", r.getName());
        r.setName(RecipeTestUtil.VALID_NAME_MOCHA);
        assertEquals("Mocha", r.getName());
    }

    @Test
    public void setAmtChocolate_success() throws RecipeException {
        r.setAmtChocolate(RecipeTestUtil.VALID_CHOCOLATE_HOTCHOCOLATE);
        assertEquals(10, r.getAmtChocolate());
        r.setAmtChocolate(RecipeTestUtil.VALID_CHOCOLATE_AMERICANO);
        assertEquals(0, r.getAmtChocolate());
        r.setAmtChocolate(RecipeTestUtil.VALID_CHOCOLATE_MOCHA);
        assertEquals(5, r.getAmtChocolate());
        r.setAmtChocolate(RecipeTestUtil.VALID_CHOCOLATE_LATTE);
        assertEquals(0, r.getAmtChocolate());
    }

    @Test
    public void setAmtChocolate_failure() {
        assertThrows(
            RecipeException.class, () -> {r.setAmtChocolate(RecipeTestUtil.INVALID_AMT_EMPTY);}
        );
        assertThrows(
                RecipeException.class, () -> {r.setAmtChocolate(RecipeTestUtil.INVALID_AMT_NEGATIVE);}
        );
        assertThrows(
                RecipeException.class, () -> {r.setAmtChocolate(RecipeTestUtil.INVALID_AMT_FLOAT);}
        );
        assertThrows(
                RecipeException.class, () -> {r.setAmtChocolate(RecipeTestUtil.INVALID_AMT_SPECIALCHAR);}
        );
        assertThrows(
                RecipeException.class, () -> {r.setAmtChocolate(RecipeTestUtil.INVALID_AMT_STRING);}
        );
    }

    @Test
    public void setAmtCoffee_success() throws RecipeException {
        r.setAmtCoffee(RecipeTestUtil.VALID_COFFEE_HOTCHOCOLATE);
        assertEquals(0, r.getAmtCoffee());
        r.setAmtCoffee(RecipeTestUtil.VALID_COFFEE_AMERICANO);
        assertEquals(5, r.getAmtCoffee());
        r.setAmtCoffee(RecipeTestUtil.VALID_COFFEE_MOCHA);
        assertEquals(5, r.getAmtCoffee());
        r.setAmtCoffee(RecipeTestUtil.VALID_COFFEE_LATTE);
        assertEquals(5, r.getAmtCoffee());
    }

    @Test
    public void setAmtCoffee_failure() {
        assertThrows(
                RecipeException.class, () -> {r.setAmtCoffee(RecipeTestUtil.INVALID_AMT_EMPTY);}
        );
        assertThrows(
                RecipeException.class, () -> {r.setAmtCoffee(RecipeTestUtil.INVALID_AMT_NEGATIVE);}
        );
        assertThrows(
                RecipeException.class, () -> {r.setAmtCoffee(RecipeTestUtil.INVALID_AMT_FLOAT);}
        );
        assertThrows(
                RecipeException.class, () -> {r.setAmtCoffee(RecipeTestUtil.INVALID_AMT_SPECIALCHAR);}
        );
        assertThrows(
                RecipeException.class, () -> {r.setAmtCoffee(RecipeTestUtil.INVALID_AMT_STRING);}
        );
    }

    @Test
    public void setAmtMilk_success() throws RecipeException {
        r.setAmtMilk(RecipeTestUtil.VALID_MILK_HOTCHOCOLATE);
        assertEquals(1, r.getAmtMilk());
        r.setAmtMilk(RecipeTestUtil.VALID_MILK_AMERICANO);
        assertEquals(0, r.getAmtMilk());
        r.setAmtMilk(RecipeTestUtil.VALID_MILK_MOCHA);
        assertEquals(1, r.getAmtMilk());
        r.setAmtMilk(RecipeTestUtil.VALID_MILK_LATTE);
        assertEquals(5, r.getAmtMilk());
    }

    @Test
    public void setAmtMilk_failure() {
        assertThrows(
                RecipeException.class, () -> {r.setAmtMilk(RecipeTestUtil.INVALID_AMT_EMPTY);}
        );
        assertThrows(
                RecipeException.class, () -> {r.setAmtMilk(RecipeTestUtil.INVALID_AMT_NEGATIVE);}
        );
        assertThrows(
                RecipeException.class, () -> {r.setAmtMilk(RecipeTestUtil.INVALID_AMT_FLOAT);}
        );
        assertThrows(
                RecipeException.class, () -> {r.setAmtMilk(RecipeTestUtil.INVALID_AMT_SPECIALCHAR);}
        );
        assertThrows(
                RecipeException.class, () -> {r.setAmtMilk(RecipeTestUtil.INVALID_AMT_STRING);}
        );
    }

    @Test
    public void setAmtSugar_success() throws RecipeException {
        r.setAmtSugar(RecipeTestUtil.VALID_SUGAR_HOTCHOCOLATE);
        assertEquals(5, r.getAmtSugar());
        r.setAmtSugar(RecipeTestUtil.VALID_SUGAR_AMERICANO);
        assertEquals(0, r.getAmtSugar());
        r.setAmtSugar(RecipeTestUtil.VALID_SUGAR_MOCHA);
        assertEquals(1, r.getAmtSugar());
        r.setAmtSugar(RecipeTestUtil.VALID_SUGAR_LATTE);
        assertEquals(0, r.getAmtSugar());
    }

    @Test
    public void setAmtSugar_failure() {
        assertThrows(
                RecipeException.class, () -> {r.setAmtSugar(RecipeTestUtil.INVALID_AMT_EMPTY);}
        );
        assertThrows(
                RecipeException.class, () -> {r.setAmtSugar(RecipeTestUtil.INVALID_AMT_NEGATIVE);}
        );
        assertThrows(
                RecipeException.class, () -> {r.setAmtSugar(RecipeTestUtil.INVALID_AMT_FLOAT);}
        );
        assertThrows(
                RecipeException.class, () -> {r.setAmtSugar(RecipeTestUtil.INVALID_AMT_SPECIALCHAR);}
        );
        assertThrows(
                RecipeException.class, () -> {r.setAmtSugar(RecipeTestUtil.INVALID_AMT_STRING);}
        );
    }

    @Test
    public void setPrice_success() throws RecipeException {
        r.setPrice(RecipeTestUtil.VALID_PRICE_HOTCHOCOLATE);
        assertEquals(5, r.getPrice());
        r.setPrice(RecipeTestUtil.VALID_PRICE_AMERICANO);
        assertEquals(0, r.getPrice());
        r.setPrice(RecipeTestUtil.VALID_PRICE_MOCHA);
        assertEquals(1, r.getPrice());
        r.setPrice(RecipeTestUtil.VALID_PRICE_LATTE);
        assertEquals(0, r.getPrice());
    }

    @Test
    public void setPrice_failure() {
        assertThrows(
                RecipeException.class, () -> {r.setPrice(RecipeTestUtil.INVALID_AMT_EMPTY);}
        );
        assertThrows(
                RecipeException.class, () -> {r.setPrice(RecipeTestUtil.INVALID_AMT_NEGATIVE);}
        );
        assertThrows(
                RecipeException.class, () -> {r.setPrice(RecipeTestUtil.INVALID_AMT_FLOAT);}
        );
        assertThrows(
                RecipeException.class, () -> {r.setPrice(RecipeTestUtil.INVALID_AMT_SPECIALCHAR);}
        );
        assertThrows(
                RecipeException.class, () -> {r.setPrice(RecipeTestUtil.INVALID_AMT_STRING);}
        );
    }

    @Test
    public void setName_toString_success() {
        r.setName(RecipeTestUtil.VALID_NAME_AMERICANO);
        assertEquals("Americano", r.toString());
        r.setName(RecipeTestUtil.VALID_NAME_LATTE);
        assertEquals("Latte", r.toString());
        r.setName(RecipeTestUtil.VALID_NAME_HOTCHOCOLATE);
        assertEquals("Hot Chocolate", r.toString());
        r.setName(RecipeTestUtil.VALID_NAME_MOCHA);
        assertEquals("Mocha", r.toString());
    }

    @Test
    public void setName_toString_null() {
        r.setName(null);
        assertEquals("", r.toString());
    }


}
