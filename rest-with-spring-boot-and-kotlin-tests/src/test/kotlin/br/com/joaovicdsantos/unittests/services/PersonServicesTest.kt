package br.com.joaovicdsantos.unittests.services

import br.com.joaovicdsantos.exception.RequiredObjectIsNullException
import br.com.joaovicdsantos.model.Person
import br.com.joaovicdsantos.repository.PersonRepository
import br.com.joaovicdsantos.services.PersonServices
import br.com.joaovicdsantos.unittests.services.mocks.MockPerson
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations
import org.mockito.junit.jupiter.MockitoExtension
import java.lang.Exception
import java.util.*

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(MockitoExtension::class)
class PersonServicesTest {

    private var input: MockPerson? = null

    @InjectMocks
    private val service: PersonServices? = null

    @Mock
    var repository: PersonRepository? = null

    @BeforeEach
    fun setupMocks() {
        input = MockPerson()
        MockitoAnnotations.openMocks(this)
    }

    @Test
    fun testFindById() {
        val person = input!!.mockEntity(1)

        `when`(repository?.findById((1))).thenReturn(Optional.of(person))

        val result = service!!.findById(1)
        assertNotNull(result)
        assertNotNull(result.id)

        assertEquals("First Name Test1", result.firstName)
        assertEquals("Last Name Test1", result.lastName)
        assertEquals("Address Test1", result.address)
        assertEquals("Female", result.gender)
    }

    @Test
    fun testCreate() {
        val entity = input!!.mockEntity(1)
        entity.id = null

        val persisted = entity.copy()
        persisted.id = 1

        `when`(repository?.save(entity)).thenReturn(persisted)

        val result = service!!.create(entity)
        assertNotNull(result)
        assertNotNull(result.id)

        assertEquals("First Name Test1", result.firstName)
        assertEquals("Last Name Test1", result.lastName)
        assertEquals("Address Test1", result.address)
        assertEquals("Female", result.gender)
    }

    @Test
    fun testCreateWithNullPerson() {
        val exception: Exception = assertThrows(RequiredObjectIsNullException::class.java) {
            service!!.create(null)
        }

        val expectedMessage = "It is not allowed to persist a null object"
        assertEquals(expectedMessage, exception.message)
    }

    @Test
    fun testUpdate() {
        val entity = input!!.mockEntity(1)
        val persisted = entity.copy()
        persisted.id = 1

        `when`(repository?.findById((1))).thenReturn(Optional.of(entity))
        `when`(repository?.save(entity)).thenReturn(persisted)

        val result = service!!.update(entity)
        assertNotNull(result)
        assertNotNull(result.id)

        assertEquals("First Name Test1", result.firstName)
        assertEquals("Last Name Test1", result.lastName)
        assertEquals("Address Test1", result.address)
        assertEquals("Female", result.gender)
    }

    @Test
    fun testUpdateWithNullPerson() {
        val exception: Exception = assertThrows(RequiredObjectIsNullException::class.java) {
            service!!.update(null)
        }

        val expectedMessage = "It is not allowed to persist a null object"
        assertEquals(expectedMessage, exception.message)
    }

    @Test
    fun testDelete() {
        val entity = input!!.mockEntity(1)
        `when`(repository?.findById((1))).thenReturn(Optional.of(entity))
        service!!.delete(1)
    }

    @Test
    fun testFindAll() {
        val list: List<Person> = input!!.mockEntityList()

        `when`(repository?.findAll()).thenReturn(list)

        val people = service!!.findAll()

        assertNotNull(people)
        assertEquals(14, people.size)

        val personOne = people[1]

        assertNotNull(personOne)
        assertNotNull(personOne.id)

        assertEquals("First Name Test1", personOne.firstName)
        assertEquals("Last Name Test1", personOne.lastName)
        assertEquals("Address Test1", personOne.address)
        assertEquals("Female", personOne.gender)



        val personFour = people[4]

        assertNotNull(personFour)
        assertNotNull(personFour.id)

        assertEquals("First Name Test4", personFour.firstName)
        assertEquals("Last Name Test4", personFour.lastName)
        assertEquals("Address Test4", personFour.address)
        assertEquals("Male", personFour.gender)

    }
}