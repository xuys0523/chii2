package org.chii2.medialibrary.persistence.entity;

import org.chii2.medialibrary.api.persistence.entity.MovieImage;

import javax.persistence.*;
import java.util.UUID;

@Entity(name = "MOVIE_IMAGE")
@Table(name = "MOVIE_IMAGE")
@NamedQueries({
        @NamedQuery(name = "MovieImage.findById",
                query = "SELECT m FROM MOVIE_IMAGE m WHERE m.id = :id")
})
public class MovieImageImpl implements MovieImage {

    // ID (Primary Key) in UUID format
    @Id
    @Column(name = "ID")
    private String id;

    // Type
    @Column(name = "IMAGE_TYPE")
    private String type;

    // Size
    @Column(name = "SIZE")
    private String size;

    // Height
    @Column(name = "HEIGHT")
    private int height;

    // Width
    @Column(name = "WIDTH")
    private int width;

    // Url
    @Column(name = "URL")
    private String url;

    // Provider Image ID
    @Column(name = "PROVIDER_ID")
    private String providerId;

    // Image binary Content
    @Lob
    @Basic
    @Column(name = "IMAGE")
    private byte[] image;

    /**
     * Constructor
     */
    public MovieImageImpl() {
        this.id = UUID.randomUUID().toString();
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String getProviderId() {
        return providerId;
    }

    @Override
    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    @Override
    public byte[] getImage() {
        return image;
    }

    @Override
    public void setImage(byte[] image) {
        this.image = image;
    }
}