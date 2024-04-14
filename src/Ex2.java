import java.util.HashMap;
import java.util.Map;

// Step 1: Define the Data class
class Data {
    private String type;
    private Object content;

    public Data(String type, Object content) {
        this.type = type;
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public Object getContent() {
        return content;
    }
}

// Step 2: Define an abstract DataProcessor class
abstract class DataProcessor {
    public abstract void process(Data data);
}

// Step 3: Create concrete DataProcessor classes for each data type
class TextDataProcessor extends DataProcessor {
    @Override
    public void process(Data data) {
        // Process text data
        System.out.println("Processing text data: " + data.getContent());
    }
}

class AudioDataProcessor extends DataProcessor {
    @Override
    public void process(Data data) {
        // Process audio data
        System.out.println("Processing audio data: " + data.getContent());
    }
}

class VideoDataProcessor extends DataProcessor {
    @Override
    public void process(Data data) {
        // Process video data
        System.out.println("Processing video data: " + data.getContent());
    }
}

// Step 4: Define the Content objects for each data type
// For simplicity, let's assume content objects are just strings

// Step 5: Create a DataProcessorCreator class
class DataProcessorCreator {
    private DataProcessor processor;

    public void setProcessor(DataProcessor processor) {
        this.processor = processor;
    }

    public void processData(Data data) {
        if (processor != null) {
            processor.process(data);
        } else {
            System.out.println("No processor set.");
        }
    }
}

// Step 6: Use the DataProcessorCreator and the concrete processors
public class Ex2 {
    public static void main(String[] args) {
        // Create processors for each data type
        TextDataProcessor textProcessor = new TextDataProcessor();
        AudioDataProcessor audioProcessor = new AudioDataProcessor();
        VideoDataProcessor videoProcessor = new VideoDataProcessor();

        // Set up data processor creator
        DataProcessorCreator processorCreator = new DataProcessorCreator();

        // Process some example data
        Data textData = new Data("text", "Sample text content");
        Data audioData = new Data("audio", "Sample audio content");
        Data videoData = new Data("video", "Sample video content");

        // Set processors and process data
        processorCreator.setProcessor(textProcessor);
        processorCreator.processData(textData);

        processorCreator.setProcessor(audioProcessor);
        processorCreator.processData(audioData);

        processorCreator.setProcessor(videoProcessor);
        processorCreator.processData(videoData);
    }
}

