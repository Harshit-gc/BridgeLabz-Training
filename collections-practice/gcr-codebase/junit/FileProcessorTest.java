package bridgelabz.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {

    @TempDir
    Path tempDir; 
    
    FileProcessor processor = new FileProcessor();

    @Test
    void testWriteAndReadCorrectly() throws IOException {
        Path file = tempDir.resolve("testfile.txt");
        String filename = file.toString();
        String content = "Hello, JUnit 5!";
        processor.writeToFile(filename, content);
        String result = processor.readFromFile(filename);
        assertEquals(content, result, "File content should match the written string.");
    }

    @Test
    void testFileExistsAfterWrite() throws IOException {
        Path file = tempDir.resolve("exists.txt");
        String filename = file.toString();
        processor.writeToFile(filename, "Check Existence");
        assertTrue(Files.exists(file), "File should exist after writeToFile is called.");
    }

    @Test
    void testReadNonExistentFile() {
        Path file = tempDir.resolve("ghost.txt");
        String filename = file.toString();
        assertThrows(IOException.class, () -> {
            processor.readFromFile(filename);
        }, "Should throw IOException when reading a non-existent file.");
    }
}