package base.constants;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapConstants {

    public static final String MAIN_MAP = "MainMap";
    public static final String SECOND_MAP = "SecondMap";
    public static final String WATER_MAP = "WaterMap";
    public static final String TOP_LEFT_MAP = "TopLeftMap";
    public static final String TOP_CENTER_MAP = "TopCenterMap";
    public static final String TOP_RIGHT_MAP = "TopRightMap";
    public static final String BOTTOM_LEFT_MAP = "BottomLeftMap";
    public static final String BOTTOM_CENTER_MAP = "BottomCenterMap";
    public static final String BOTTOM_RIGHT_MAP = "BottomRightMap";

    public static final List<String> HOME_MAPS = Arrays.asList(TOP_CENTER_MAP, TOP_RIGHT_MAP);
    public static final List<String> MAPS_NEAR_MAIN_MAP = Arrays.asList(TOP_CENTER_MAP, SECOND_MAP, WATER_MAP, BOTTOM_CENTER_MAP);
    public static final List<String> BOTTOM_MAPS = Arrays.asList(BOTTOM_LEFT_MAP, BOTTOM_CENTER_MAP, BOTTOM_RIGHT_MAP);
    public static final List<String> OUTSIDE_MAPS = Arrays.asList(TOP_LEFT_MAP, SECOND_MAP, MAIN_MAP, WATER_MAP, BOTTOM_LEFT_MAP, BOTTOM_CENTER_MAP, BOTTOM_RIGHT_MAP);

    public static final Map<String, String> PRETTIER_MAP_NAMES = new HashMap<>();

    static {
        PRETTIER_MAP_NAMES.put(MAIN_MAP, "Starting Map");
        PRETTIER_MAP_NAMES.put(SECOND_MAP, "Second Map");
        PRETTIER_MAP_NAMES.put(WATER_MAP, "Island");

        PRETTIER_MAP_NAMES.put(TOP_LEFT_MAP, "Backyard");
        PRETTIER_MAP_NAMES.put(TOP_CENTER_MAP, "Home");
        PRETTIER_MAP_NAMES.put(TOP_RIGHT_MAP, "Home 2");

        PRETTIER_MAP_NAMES.put(BOTTOM_LEFT_MAP, "Bottom Left Map");
        PRETTIER_MAP_NAMES.put(BOTTOM_CENTER_MAP, "Bottom Center Map");
        PRETTIER_MAP_NAMES.put(BOTTOM_RIGHT_MAP, "Bottom Right Map");
    }
}