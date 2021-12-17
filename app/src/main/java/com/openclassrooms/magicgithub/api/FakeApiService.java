package com.openclassrooms.magicgithub.api;

import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.generateUsers;

import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class FakeApiService implements ApiService {

    final private List<User> users = generateUsers();

    /**
     * Return a list of {@link User}
     * Those users must be generated by {@link FakeApiServiceGenerator}
     */


    @Override
    public List<User> getUsers() {
        return users; // Done
    }

    /**
     * Generate a random {@link User} and add it {@link FakeApiService#users} list.
     * This user must be get from the {@link FakeApiServiceGenerator#FAKE_USERS_RANDOM} list.
     */
    @Override
    public void generateRandomUser() {
        users.add(User.random()); // Done

    }

    /**
     * Delete a {@link User} from the {@link FakeApiService#users} list.
     */
    @Override
    public void deleteUser(User user) {
        users.remove(user); // Done
    }
}