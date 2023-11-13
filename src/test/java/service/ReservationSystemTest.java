package service;

import dao.ConferenceRoomDao;
import model.ConferenceRoom;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

public class ReservationSystemTest {

    private ReservationSystem system;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);

    }

    @Test
    public void testReserveRoom() {
        // Implementar pruebas aquí

        ConferenceRoom room1 = new ConferenceRoom("1", 10);
        ConferenceRoom room2 = new ConferenceRoom("2", 20);
        ConferenceRoom room3 = new ConferenceRoom("3", 35);
        ConferenceRoom room4 = new ConferenceRoom("4", 49);
        room2.setReserved(true);

        assertEquals ("1", room1.getId());
        assertEquals(10, room1.getCapacity());
        assertFalse(room1.isReserved());

        assertEquals ("2", room2.getId());
        assertEquals(20, room2.getCapacity());
        assertTrue(room2.isReserved());


    }

    @Test
    public void testCancelReservation() {
        // Implementar pruebas aquí

        ConferenceRoom room2 = new ConferenceRoom("2", 12);
        room2.setReserved(true);
        

        boolean cancellationService = system.cancelReservation("2");

        assertTrue(cancellationService);
        assertFalse(room2.isReserved());

    }

    // Puedes añadir más pruebas según lo consideres necesario
}
