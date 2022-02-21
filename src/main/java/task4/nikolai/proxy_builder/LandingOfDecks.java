package task4.nikolai.proxy_builder;

import task4.nikolai.proxy_builder.decks.SkateBoard;
import task4.nikolai.proxy_builder.decks.Snowboard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


//Ипмпровизированная компания сдачи в аренду досок
public class LandingOfDecks implements BoardsCreater {

    MainCreater mainCreater;
    HashMap<String, ArrayList<Snowboard>> snowboards = new HashMap<>();
    HashMap<String, ArrayList<SkateBoard>> skateboards = new HashMap<>();

    public LandingOfDecks() {
        this.mainCreater = new MainCreater();
    }

    //если сноуборд с необходимыми параметрами и от нужного брэнда есть то он выдается из мапы. Если нет то он создается
    @Override
    public Snowboard takeSnowboard(String brand, String matrial, int inchlong, int width) {
        ArrayList<Snowboard> storage = snowboards.get(brand);
        if (storage != null){
            for (Snowboard s : storage){
                if (s.getMaterial().equals(matrial) &&
                        s.getInchLong() == inchlong &&
                        s.getInchWidth() == width) return s;
            }
            storage.add(mainCreater.takeSnowboard(brand, matrial, inchlong, width));
        }
        else {
            storage = new ArrayList<>(List.of(mainCreater.takeSnowboard(brand, matrial, inchlong, width)));
            snowboards.put(brand, storage);
        }
        return storage.get(storage.size() - 1);
    }


    //если скейтборд с необходимыми параметрами и от нужного брэнда есть то он выдается из мапы. Если нет то он создается
    @Override
    public SkateBoard takeSkateboard(String brand,String matrial, int numberOfWheels, int inchlong, int width) {
        ArrayList<SkateBoard> storage = skateboards.get(brand);
        if (storage != null){
            for (SkateBoard s : storage){
                if (s.getMaterial().equals(matrial) &&
                        s.getInchLong() == inchlong &&
                        s.getInchWidth() == width &&
                        s.getNuberOfweels() == numberOfWheels) return s;
            }
            storage.add(mainCreater.takeSkateboard(brand, matrial, numberOfWheels, inchlong, width));
        }
        else {
            storage = new ArrayList<>(List.of(mainCreater.takeSkateboard(brand, matrial, numberOfWheels, inchlong, width)));
            skateboards.put(brand, storage);
        }
        return storage.get(storage.size() - 1);
    }




}
