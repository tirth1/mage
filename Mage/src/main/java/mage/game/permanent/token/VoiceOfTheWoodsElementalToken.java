package mage.game.permanent.token;

import mage.MageInt;
import mage.abilities.keyword.TrampleAbility;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 * @author spjspj
 */
public final class VoiceOfTheWoodsElementalToken extends TokenImpl {

    public VoiceOfTheWoodsElementalToken() {
        super("Elemental Token", "7/7 green Elemental creature token with trample");
        cardType.add(CardType.CREATURE);
        subtype.add(SubType.ELEMENTAL);

        color.setGreen(true);
        power = new MageInt(7);
        toughness = new MageInt(7);

        addAbility(TrampleAbility.getInstance());
    }

    protected VoiceOfTheWoodsElementalToken(final VoiceOfTheWoodsElementalToken token) {
        super(token);
    }

    public VoiceOfTheWoodsElementalToken copy() {
        return new VoiceOfTheWoodsElementalToken(this);
    }
}
