package fullstack.bead.shoppingList.repositories;

import fullstack.bead.shoppingList.models.Item;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item, Integer> {
//    @Query(value="select * from items where id=:id",nativeQuery=true)
//    public Item getItemById(@Param("id") Integer id);

}
