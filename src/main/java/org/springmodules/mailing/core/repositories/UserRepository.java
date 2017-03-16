/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springmodules.mailing.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springmodules.mailing.core.entity.User;


/**
 *
 * @author OPEYEMI
 */

public interface UserRepository extends JpaRepository<User, Long>  {
    
}
