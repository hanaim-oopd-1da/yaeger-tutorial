package com.github.hanyaeger.tutorial.buttons;

import com.github.hanyaeger.api.engine.entities.entity.Location;
import com.github.hanyaeger.api.engine.entities.entity.events.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.engine.entities.entity.shape.text.TextEntity;
import com.github.hanyaeger.api.engine.styles.HanFont;
import com.github.hanyaeger.tutorial.Waterworld;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;

public class StartButton extends TextEntity implements MouseButtonPressedListener {

    private final Waterworld waterworld;

    public StartButton(Location initialPosition, Waterworld waterworld) {
        super(initialPosition, "Play game");
        this.waterworld = waterworld;
        setFill(Color.PURPLE);
        setFont(HanFont.createDefaultCondensedFont(30));
    }

    @Override
    public void onMouseButtonPressed(MouseButton button, double x, double y) {
        waterworld.setActiveScene(1);
    }
}