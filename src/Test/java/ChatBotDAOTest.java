    import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.Test;
	import static org.mockito.Mockito.*;
	import java.sql.Connection;
	import java.sql.SQLException;

	public class ChatBotDAOTest {
	    private ChatBotDAO chatBotDAO;
	    private Connection mockConnection;

	    @BeforeEach
	    public void setUp() {
	        mockConnection = mock(Connection.class);
	        chatBotDAO = new ChatBotDAO(mockConnection);
	    }

	    @Test
	    public void testSaveMessage() throws SQLException {
	        chatBotDAO.saveMessage("user1", "Hello, World!");
	        // Verify that the saveMessage method interacts with the database correctly
	    }

	    @Test
	    public void testGetLastMessage() throws SQLException {
	        String message = chatBotDAO.getLastMessage("user1");
	        // Verify that the getLastMessage method returns the correct message
	    }
	}






