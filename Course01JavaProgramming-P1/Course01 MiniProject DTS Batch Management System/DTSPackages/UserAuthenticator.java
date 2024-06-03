package DTSPackages;

public class UserAuthenticator {
        private final String username;
        private final String password;
    
        public UserAuthenticator(String username, String password) {
            this.username = username;
            this.password = password;
        }
    
        public String getUsername() {
            return username;
        }
    
        public String getPassword() {
            return password;
        }

}
