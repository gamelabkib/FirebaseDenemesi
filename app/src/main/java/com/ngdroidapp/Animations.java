package com.ngdroidapp;

import istanbul.gamelab.ngdroid.util.Utils;

public class Animations {
    private Character character = new Character();
    //Nesnenin X ve Y Konumu
    private int objectX, objectY;
    //Hedefin X ve Y Konumu
    private int targetX, targetY;
    //Karakterin X ve Y Konumu
    private int characterX, characterY, characterWidth, characterHeight;

    public Animations(Character character) {
        //Character Sınıfından karakterin X ve Y'sinin çekilmesi
        this.character = character;

        characterX = character.getNobjectdstx();
        characterY = character.getNobjectdstx();
        characterWidth = character.getNobjectdstw();
        characterHeight = character.getNobjectdsth();
        objectX = characterX;
        objectY = characterY;
    }

    public boolean Collision() {/*
    //Objelerin Karşılaştırılması
if(Utils.checkCollision(character.getNobjectdestination(),character.getNobjectdestination())
    {
        return true;
    }
    else{
    return false;
}
*/
return false;
    }


    public void ShoutAnımation() {/*
    if(!Collision())
    { objectX++;
    character.setNobjectdstx(objectX);}
    else
    {
    }
}
*/

    }
}