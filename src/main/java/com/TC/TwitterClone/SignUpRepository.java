package com.TC.TwitterClone;


        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface SignUpRepository extends JpaRepository<SigningUp, Long> {}
