package codingdojo;

/**
 * This class contains some sample product data that you could use in your tests.
 */
public class SampleModelObjects {

    public static final Product CHERRY_BLOOM = new Product("Cherry Bloom", "LIPSTICK01", 30, new Price(14.99D, "USD"));
    public static final Product ROSE_PETAL = new Product("Rose Petal", "LIPSTICK02", 30, new Price(14.99D, "USD"));
    public static final Product BLUSHER_BRUSH = new Product("Blusher Brush", "TOOL01", 50, new Price(24.99D, "USD"));
    public static final Product EYELASH_CURLER = new Product("Eyelash curler", "TOOL01", 100, new Price(19.99D, "USD"));
    public static final Product WILD_ROSE = new Product("Wild Rose", "PURFUME01", 200, new Price(34.99D, "USD"));
    public static final Product COCOA_BUTTER = new Product("Cocoa Butter", "SKIN_CREAM01", 250, new Price(10.99D, "USD"));

    public static final Store FLAGSHIP_STORE = new Store("Nordstan", "4189", new Product[] {CHERRY_BLOOM});

    // Store events add themselves to the stocked items at their store
    public static final Product MASTERCLASS = new StoreEvent("Eyeshadow Masterclass", "EVENT01", FLAGSHIP_STORE, new Price(119.99D, "USD"));
    public static final Product MAKEOVER = new StoreEvent("Makeover", "EVENT02", FLAGSHIP_STORE, new Price(149.99D, "USD"));

    public static final Order RECENT_ORDER = new Order("1234", Util.fromIsoDate("2018-09-01T00:00Z"),
            FLAGSHIP_STORE, new Product[] {MAKEOVER});

    private SampleModelObjects() {
        throw new AssertionError("Utility class not intended for instantiation!");
    }
}
