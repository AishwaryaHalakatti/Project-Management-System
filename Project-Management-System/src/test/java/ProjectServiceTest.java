import com.example.models.Project;
import com.example.repositories.ProjectRepository;
import com.example.services.ProjectService;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ProjectServiceTest {

    @Autowired
    private ProjectService projectService;

    @MockBean
    private ProjectRepository projectRepository;

    @Test
    public void testGetProjectById() {
        // Mock data
        Project project = new Project();
        project.setId(1L);
        project.setName("Test Project");

        // Mock repository behavior
        when(projectRepository.findById(1L)).thenReturn(Optional.of(project));

        // Test service method
        Project retrievedProject = projectService.getProjectById(1L);

        // Assert
        assertEquals("Test Project", retrievedProject.getName());
    }
}
