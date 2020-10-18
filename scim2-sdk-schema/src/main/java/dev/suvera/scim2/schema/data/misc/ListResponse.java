package dev.suvera.scim2.schema.data.misc;

import dev.suvera.scim2.schema.data.BaseRecord;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.util.List;
import java.util.Set;

/**
 * author: suvera
 * date: 10/17/2020 12:39 PM
 */
@Data
public class ListResponse<T extends BaseRecord> {

    /**
     * This must be ScimConstant.URN_LIST_RESPONSE
     */
    private Set<String> schemas;

    @NotNull(message = "totalResults cannot be null")
    @PositiveOrZero(message = "totalResults must be 0 or greater")
    private Integer totalResults;
    private Integer itemsPerPage;
    private Integer startIndex;

    private List<T> Resources;
}
