package personal.model;

import java.util.List;

public interface FileOperation {
    List<String> readAllLines();

    void saveAllLines2(List<String> lines);
}
