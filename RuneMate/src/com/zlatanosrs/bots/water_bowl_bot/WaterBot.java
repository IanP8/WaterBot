package com.zlatanosrs.bots.water_bowl_bot;

import com.runemate.game.api.hybrid.entities.GameObject;
import com.runemate.game.api.hybrid.local.Camera;
import com.runemate.game.api.hybrid.local.hud.interfaces.Bank;
import com.runemate.game.api.hybrid.local.hud.interfaces.Inventory;
import com.runemate.game.api.hybrid.local.hud.interfaces.SpriteItem;
import com.runemate.game.api.hybrid.location.Area;
import com.runemate.game.api.hybrid.location.Coordinate;
import com.runemate.game.api.hybrid.location.navigation.cognizant.RegionPath;
import com.runemate.game.api.hybrid.region.GameObjects;
import com.runemate.game.api.hybrid.region.Players;
import com.runemate.game.api.script.Execution;
import com.runemate.game.api.script.framework.LoopingBot;



public class WaterBot extends LoopingBot {

    Coordinate playerPos = Players.getLocal().getPosition();


    @Override
    public void onLoop() {
        System.out.println(playerPos);
        System.out.println(playerPos.getX());
        System.out.println(playerPos.getY());
        System.out.println(playerPos.getPlane());
       /* final Area bank = new Area.Rectangular(new Coordinate(xxxx, xxxx, x), new Coordinate(xxxx, xxxx, x));// Bank area
        final Area fountainArea = new Area.Rectangular(new Coordinate(xxxx, xxxx, x), new Coordinate(xxxx, xxxx, x));//Fountain area
        GameObject closedBank = GameObjects.newQuery().names("Bank Chest").actions("Use").results().nearest();
        SpriteItem bowl = Bank.newQuery().names("Bowl").actions("use").results().first();
        GameObject fountain = GameObjects.newQuery().names("Fountain").actions("use").results().nearest();
        SpriteItem waterBowl = Inventory.newQuery().names("Bowl of water").actions("use").results().first();


        final Coordinate destination = bank.getRandomCoordinate();// Gets random Coordinate in area
        final Coordinate fountainDestination = fountainArea.getRandomCoordinate();//Gets random coordinate in area
        final RegionPath pathToBank = RegionPath.buildTo(destination); // Sets path
        final RegionPath pathToFountain = RegionPath.buildTo(fountainDestination);


        if(Inventory.containsAllOf("Bowl of water")){


            if (!Bank.isOpen()) { // Check if bank is open

                if (pathToBank != null)
                    pathToBank.step(true); // goes to the bank
                 if (closedBank != null) {
                    System.out.println("Bank found.");
                    Camera.turnTo(closedBank);
                    closedBank.interact("Use");
                    Execution.delay(1000);
                     if(Bank.isOpen()) {
                        Bank.withdraw(bowl, 28);
                        Bank.close();
                     }
                         if(pathToFountain != null) {
                            pathToFountain.step(true);
                            bowl.click();
                            fountain.click();
                         }


            }
         }
        }*/
    }
}
