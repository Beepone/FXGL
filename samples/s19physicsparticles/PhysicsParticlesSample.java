/*
 * The MIT License (MIT)
 *
 * FXGL - JavaFX Game Library
 *
 * Copyright (c) 2015-2016 AlmasB (almaslvl@gmail.com)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package s19physicsparticles;

import com.almasb.fxgl.app.ApplicationMode;
import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.physics.PhysicsWorld;
import com.almasb.fxgl.settings.GameSettings;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import org.jbox2d.particle.ParticleGroupDef;
import org.jbox2d.particle.ParticleType;

import java.util.EnumSet;

/**
 * This is an example of a basic FXGL game application.
 *
 * @author Almas Baimagambetov (AlmasB) (almaslvl@gmail.com)
 *
 */
public class PhysicsParticlesSample extends GameApplication {

    private enum Type {
        BOUNDS, CLOTH, WATER
    }

    @Override
    protected void initSettings(GameSettings settings) {
        settings.setWidth(800);
        settings.setHeight(600);
        settings.setTitle("PhysicsParticlesSample");
        settings.setVersion("0.1developer");
        settings.setFullScreen(false);
        settings.setIntroEnabled(false);
        settings.setMenuEnabled(false);
        settings.setShowFPS(true);
        settings.setApplicationMode(ApplicationMode.DEVELOPER);
    }

    @Override
    protected void initInput() {}

    @Override
    protected void initAssets() {}

    @Override
    protected void initGame() {
//        initScreenBounds();
//
//        // 1. define how particles should behave
//        ParticleGroupDef groupDef = new ParticleGroupDef();
//        groupDef.setTypes(EnumSet.of(ParticleType.ELASTIC));
//
//        // 2. ask physics world to create particle entity
//        PhysicsWorld.PhysicsParticleEntity cloth = getPhysicsWorld().newPhysicsParticleEntity(50, 10, 75, 150, Color.DARKGREEN.brighter(), Type.CLOTH,
//                groupDef);
//
//        groupDef = new ParticleGroupDef();
//        groupDef.setTypes(EnumSet.of(ParticleType.VISCOUS, ParticleType.TENSILE));
//
//        PhysicsWorld.PhysicsParticleEntity liquid = getPhysicsWorld().newPhysicsParticleEntity(200, 10, 70, 70, Color.BLUE.brighter(), Type.WATER,
//                groupDef);
//
//        // 3. add to game world
//        getGameWorld().addEntities(cloth, liquid);
    }

    private void initScreenBounds() {
//        PhysicsEntity top = new PhysicsEntity(Type.BOUNDS);
//        top.setPosition(0, 0 - 100);
//        top.setSceneView(new Rectangle(getWidth(), 100));
//
//        PhysicsEntity bot = new PhysicsEntity(Type.BOUNDS);
//        bot.setPosition(0, getHeight() - 100);
//        bot.setSceneView(new Rectangle(getWidth(), 100));
//
//        PhysicsEntity left = new PhysicsEntity(Type.BOUNDS);
//        left.setPosition(0 - 100 + 10, 0);
//        left.setSceneView(new Rectangle(100, getHeight()));
//
//        PhysicsEntity right = new PhysicsEntity(Type.BOUNDS);
//        right.setPosition(getWidth(), 0);
//        right.setSceneView(new Rectangle(100, getHeight()));
//
//        PhysicsEntity ground = new PhysicsEntity(Type.BOUNDS);
//        ground.setSceneView(new Rectangle(200, 50));
//        ground.setPosition(50, 300);
//
//        getGameWorld().addEntities(top, bot, left, right, ground);
    }

    @Override
    protected void initPhysics() {}

    @Override
    protected void initUI() {}

    @Override
    protected void onUpdate() {}

    public static void main(String[] args) {
        launch(args);
    }
}
