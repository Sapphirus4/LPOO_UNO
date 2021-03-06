package feup.lpoo_uno.logic.card;

/**
 * @author Sony
 * @version 1.0
 * @created 25-Mai-2015 15:48:11
 */
public abstract class ColoredCard extends Card {

    /**
     *
     */
	private Color color;

    /**
     * @param value
     * @param color
     */
	public ColoredCard(int value, Color color){
        super(value);
        this.color = color;
	}

	public Color getColor() {
		return color;
	}


	

}