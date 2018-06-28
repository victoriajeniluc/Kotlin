class Post < ApplicationRecord
	validates :title, :body, :gratitude, presence: true
end
