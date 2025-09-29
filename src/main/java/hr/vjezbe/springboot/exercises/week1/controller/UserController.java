package hr.vjezbe.springboot.exercises.week1.controller;

import hr.vjezbe.springboot.exercises.week1.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private Long nextId = 1L;
    private List<User> users = new ArrayList<>();

    // CREATE USER - POST api/users
    @PostMapping
    public User createUser(@RequestBody User user){
        user.setId(nextId++);
        users.add(user);
        return user;
    }

    // GET USER - GET /api/users/{id}
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
    }

    //GET ALL USERS - GET /api/users
    @GetMapping
    public List<User> getAllUsers(){
        return users;
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User updatedUser){
        Optional<User> optionalUser = users.stream().filter(user -> user.getId().equals(id)).findFirst();

        if(optionalUser.isPresent()){
            optionalUser.get().setName(updatedUser.getName());
            optionalUser.get().setAge(updatedUser.getAge());
        }
        return optionalUser.orElse(null);
    }

    // DELETE - DELETE /api/users/{id}
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id){
        boolean userRemoved = users.removeIf(user -> user.getId().equals(id));
        return userRemoved ? "User removed " : "Failed to remove user";
    }



}
