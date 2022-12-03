package JavaHW6;

public class Notebooks {
    String model;
    Double diagonal;
    String operatingSystem;
    Integer capacityRam;
    String typeVideoCard;
    String typeProcessor;
    String typeHardDrive;
    Integer capacityHardDrive;
    String color;
    Integer price;

    public Notebooks(String model, Double diagonal, String operatingSystem, Integer capacityRam, String typeVideoCard,
            String typeProcessor, String typeHardDrive, Integer capacityHardDrive, String color, Integer price) {
        this.model = model;
        this.diagonal = diagonal;
        this.operatingSystem = operatingSystem;
        this.capacityRam = capacityRam;
        this.typeVideoCard = typeVideoCard;
        this.typeProcessor = typeProcessor;
        this.typeHardDrive = typeHardDrive;
        this.capacityHardDrive = capacityHardDrive;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s, %.1f, %s, %d, %s, %s, %s, %d, %s, %d", model, diagonal, operatingSystem, capacityRam,
                typeVideoCard, typeProcessor,
                typeHardDrive, capacityHardDrive, color, price);
    }
}