public class Factory {
    public  Chair createChair (ChairType type) {
        Chair chair = switch (type) {
            case VICTORIAN -> new VICTORIAN();
            case MULTIFUNC -> new MULTIFUNC();
            case MAGIC -> new MAGIC();
        };

        return chair;
    }
}