package staticpackage;

public interface Car {
    static float converToMilesPerHour(float kmh) {
        return 0.62f * kmh;
        //return 2 / 3 * kmh;

    }
}
